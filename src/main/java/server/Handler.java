package server;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class Handler extends SimpleChannelInboundHandler<Object> {

    private Gson gson = new Gson();
    private JsonParser parser = new JsonParser();

    @Override
    public void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        JsonArray array = parser.parse((String)msg).getAsJsonArray();
        int methodNumber = gson.fromJson(array.get(0), int.class);
        String filePath = gson.fromJson(array.get(1), String.class);
        System.out.printf("Method #%d\n", methodNumber);
        System.out.printf("file: %s\n", filePath);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        // Close the connection when an exception is raised.
        cause.printStackTrace();
        ctx.close();
    }
}
