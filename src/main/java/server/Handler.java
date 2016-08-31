package server;

import java.io.StringReader;
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
            Languages.languages.forEach((l)->System.out.println(l.name()));
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
            // grammar_use
            //
            int languageIndex = gson.fromJson(array.get(1), int.class);
            Language language = Languages.get(languageIndex);
            System.out.println("Language: "+language.name());
            String code_as_str = gson.fromJson(array.get(2), String.class);
            StringReader code = new StringReader(code_as_str);
            int end = 80;
            if (code_as_str.length() < end) {
                end = code_as_str.length();
            }
            System.out.println("Code: "+code_as_str.substring(0, end));
            TechProfile profile = language.grammar_use(code);
            System.out.println(Arrays.toString(profile.data.entrySet().toArray()));
            ctx.write(gson.toJson(profile.data));
            ctx.write("\n");
            ctx.flush();
        } else if (methodNumber == 3) {
            //
            // extract_library_bindings
            //
            int languageIndex = gson.fromJson(array.get(1), int.class);
            Language language = Languages.get(languageIndex);
            System.out.println("Language: "+language.name());
            String code_as_str = gson.fromJson(array.get(2), String.class);
            StringReader code = new StringReader(code_as_str);
            int end = 80;
            if (code_as_str.length() < end) {
                end = code_as_str.length();
            }
            System.out.println("Code: "+code_as_str.substring(0, end));
            String filename = gson.fromJson(array.get(3), String.class);
            System.out.println("Filename: "+filename);
            HashMap<String, String[]> library_bindings = language.extract_library_bindings(code, filename);
            System.out.println(Arrays.toString(library_bindings.entrySet().toArray()));
            ctx.write(gson.toJson(library_bindings));
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
