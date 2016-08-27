package server;

import java.io.StringReader;
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
            int languageIndex = gson.fromJson(array.get(1), int.class);
            Language language = Languages.get(languageIndex);
            StringReader code = new StringReader(gson.fromJson(array.get(1), String.class));
            TechProfile profile = language.parse(code);
            ctx.write(gson.toJson(profile));
        } else if (methodNumber == 1) {
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
