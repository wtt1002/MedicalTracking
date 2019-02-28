package lab.c505;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//import org.junit.jupiter.api.Test;

/**
 * mybatis-plus 自动生成代码
 *
 * @author Terry
 * @version 1.0
 * @date 2018-05-16 09:35
 */
public class CodeGenerator {

    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotEmpty(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(true)//开启AR模式
                .setAuthor("TingTing W")//设置作者
                //生成路径(一般都是生成在此项目的src/main/java下面)
                .setOutputDir("E:\\IDEAProjects\\MedicalTracking\\src\\main\\java")
                .setFileOverride(true)//第二次生成会把第一次生成的覆盖掉
//                .setIdType(IdType.AUTO)//主键策略
                .setServiceName("%sService")//生成的service接口名字首字母是否为I，这样设置就没有I
                .setBaseResultMap(true)//生成resultMap
                .setBaseColumnList(true);//在xml中生成基础列
        //2、数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)//数据库类型
                .setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql:///mygoddb")
                .setUsername("root")
                .setPassword("");
        //3、策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true)//开启全局大写命名
//                .setDbColumnUnderline(true)//表名字段名使用下划线
//                .setSuperEntityClass("com.baomidou.ant.common.BaseEntity")
                .setNaming(NamingStrategy.underline_to_camel)//下划线到驼峰的命名方式
                .setTablePrefix("t_")//表名前缀
                .setEntityLombokModel(true)//使用lombok
                .setEntityColumnConstant(true)// 【实体】是否生成字段常量（默认 false）
                // 自定义实体，公共字段
                .setSuperEntityColumns(new String[] { "VERSION","CREATE_TIME","CREATE_USER","MODIFY_TIME","MODIFY_USER","DELETE_FLAG" });



//                .setInclude("表1","表2");//逆向工程使用的表
        //4、包名策略配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("lab.c505")//设置包名的parent
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setEntity("entity")
                .setXml("mapper");//设置xml文件的目录
        //5、整合配置
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig);
        //6、执行
        autoGenerator.execute();
    }

}