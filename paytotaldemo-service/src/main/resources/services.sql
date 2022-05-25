set @packageName 'my.app.pay.service.generated'; -- 生成的服务接口所在的包名
--set @srcDir './src/main/java'; -- 生成的服务接口对应的源文件所在的根目录

-- 删除服务: paytotaldemo_service
drop service if exists hello_service;

-- 创建服务: paytotaldemo_service，会生成一个对应的 PaytotaldemoService 接口
create service if not exists hello_service (
  hello(name varchar) varchar,
  say_bye() varchar
)


package @packageName
implement by 'my.app.pay.service.HelloServiceImpl' -- PaytotaldemoService 接口的默认实现类
generate code @srcDir;
