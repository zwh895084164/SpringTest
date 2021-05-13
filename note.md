##注解说明
@AutoWried 根据属性类型
@Qualifier 根据属性名称  和@AutoWried一起使用；当一个接口存在多个实现类，使用@AutoWried根据类型注入的时候会不知道要用哪个实现类，加上@Qualifier指定实现类名称
@Resourse  可以根据类型也可以根据名称注入