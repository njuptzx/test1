package com.zhangxu.zxrpc.client;

import com.zhangxu.zxrpc.Peer;
import com.zhangxu.zxrpc.codec.Decoder;
import com.zhangxu.zxrpc.codec.Encoder;
import com.zhangxu.zxrpc.codec.JSONDecoder;
import com.zhangxu.zxrpc.codec.JSONEncoder;
import com.zhangxu.zxrpc.transport.HTTPTransportClient;
import com.zhangxu.zxrpc.transport.TransportClient;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass = HTTPTransportClient.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private Class<? extends  TransportSelector> selectorClass = RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(new Peer("127.0.0.1", 3000));

}
