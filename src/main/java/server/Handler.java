package server;

import java.io.StringReader;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import lang.Language;
import lang.Languages;
import scan.TechProfile;

// TODO add rsyslog logger so this server is less of a black box

public class Handler extends SimpleChannelInboundHandler<Object> {

    private Gson gson = new Gson();
    private JsonParser parser = new JsonParser();

    @Override
    public void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        JsonArray array = parser.parse((String)msg).getAsJsonArray();
        int methodNumber = gson.fromJson(array.get(0), int.class);
        if (methodNumber == 0) {
            //
            // languages
            //
            //Languages.languages.forEach((l)->System.out.println(l.name()));
            // write a JSON array of languages: "[\"cpp\", \"java\", ..., \"lua\" ]"
            ctx.write(
                    gson.toJson(
                        Languages.languages.stream()
                        .map((l)->l.name())
                        .toArray()
                        )
                    );
            ctx.write("\n");
            ctx.flush();
        } else if (methodNumber == 1) {
            //
            // grammar_rules
            //
            int languageIndex = gson.fromJson(array.get(1), int.class);
            String[] rules = Languages.get(languageIndex).grammarRules();
            ctx.write(gson.toJson(rules));
            ctx.write("\n");
            ctx.flush();
        } else if (methodNumber == 2) {
            //
            // scan_contents
            //
            int languageIndex = gson.fromJson(array.get(1), int.class);
            Language language = Languages.get(languageIndex);
            String code_as_str = gson.fromJson(array.get(2), String.class);
            StringReader code = new StringReader(code_as_str);
            String context_as_str = gson.fromJson(array.get(3), String.class);
            StringReader context = new StringReader(context_as_str);
            int end = 80;
            if (code_as_str.length() < end) {
                end = code_as_str.length();
            }
            TechProfile profile = language.scan_contents(code, context);
            //System.out.println(Arrays.toString(profile.toMap().entrySet().toArray()));
            ctx.write(gson.toJson(profile.toMap()));
            ctx.write("\n");
            ctx.flush();
        } else if (methodNumber == 3) {
            //
            // scan_patch
            //
            int languageIndex = gson.fromJson(array.get(1), int.class);
            Language language = Languages.get(languageIndex);
            //System.out.println("Language: "+language.name());
            String code = gson.fromJson(array.get(2), String.class);
            String context = gson.fromJson(array.get(3), String.class);
            String previous_code = gson.fromJson(array.get(4), String.class);
            String previous_context = gson.fromJson(array.get(5), String.class);
            TechProfile profile = language.scan_patch(code, context, previous_code, previous_context);
            System.out.println(Arrays.toString(profile.toMap().entrySet().toArray()));
            ctx.write(gson.toJson(profile.toMap()));
            ctx.write("\n");
            ctx.flush();

        } else {
            System.out.println("Invalid method number. Should throw an exception");
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        // Close the connection when an exception is raised.
        cause.printStackTrace();
        ctx.close();
    }
}
