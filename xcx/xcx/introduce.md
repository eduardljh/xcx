第一步：
    启动配置服务：用于读取所有服务配置信息
        xcx-config-3344
    
第二步：
    启动eureka集群
        xcx-config-eureka-client-7001、xcx-config-eureka-client-7002
    访问地址：
        http://eureka7001.com:7001/
        http://eureka7002.com:7002/

第三步：
    启动提供服务
        xcx-config-act-server-8001、xcx-config-act-server-8002
    访问地址
        http://localhost:8001/act/getActInfo
        http://localhost:8002/act/getActInfo
    8001和8002 使用feign负载


第四步：
    启动hystrix-dashboard监控服务
        xcx-consumer-hystrix-dashboard
    访问地址
        http://localhost:9001/hystrix
        查看8001服务监控
        http://localhost:8001/hystrix.stream
        查看8002服务监控
        http://localhost:8002/hystrix.stream

第五步：
    启动服务消费客户端：
        xcx-config-consumer-act-feign
    访问地址
        http://localhost/consumer/act/getActInfo

第六步：
    配置网关路由：
        xcx-config-zuul-gateway-9527
    访问地址
        http://myzuul.com:9527/cqrcb/myact/act/getActInfo
    


