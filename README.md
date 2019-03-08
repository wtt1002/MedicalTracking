# 一、患者档案界面

## 1、查询接口

### （1）    前端发送数据：

    patientId
    
### （2）	前端需求：

    1)	请包含患者基本信息实体patient，并将出生日趋转换为“yyyy-MM-dd”格式。
    2)	患者病史，传回一个list，按图片所需信息传回（病史id，入院时间，出院时间，介入术者，主要诊断），时间请转为“yyyy-MM-dd”格式

![](/src/main/resources/img/patientInfoList.png)

## 2、添加接口

### （1）	前端发送数据

![](/src/main/resources/img/ui-1.png)

### （2）	前端需求：

    正常response返回
    
![](/src/main/resources/img/medicalHistory.png)

 

#二、患者病史详情界面

## 1、查询接口

### （1）	前端发送数据：

    medicalHistoryId
    
### （2）	前端需求：

    请包含病史medicalHistory实体，并将入院时间和出院时间转为“yyyy-MM-dd”格式
    
## 2、保存接口

### （1）	前端发送数据：

![](/src/main/resources/img/ui-2.png)

### （2）	前端需求：

    正常response返回
    
![](/src/main/resources/img/medicalHistory.png)



# 三、术前辅助检查

## 1、查询接口

### （1）前端发送数据： 

    medicalHistoryId
    
### （2）前端需求：

    返回list套json，日期请返回“yyyy-MM-dd”格式
    
![](/src/main/resources/img/ui-3.png)

## 2、保存接口

### （1）	前端发送数据

![](/src/main/resources/img/ui-4.png)

### （2）	前端需求

    下图多个保存共用同一个保存接口，正常response返回。
    
![](/src/main/resources/img/exam-1.png)

![](/src/main/resources/img/exam-2.png)





 
 
# 四、出院小结

## 1、查询接口

### （1）	前端发送数据：

    medicalHistoryId
    
### （2）	前端需求：

    pci术后检查数据要求 同 “术前辅助检查”的数据要求，血管路入并发症 和评分，分别在两个实体。

## 2、保存接口

### （1）	前端发送数据：

![](/src/main/resources/img/ui-5.png)

### （2）	前端需求：

    血管路入并发症 和评分公用一个保存接口，前端都是发送两个对象给后端
    
![](/src/main/resources/img/conclusion.png)



 
# 五、出院带药

## 1、查询接口

### （1）	前端发送数据：

    medicalHistoryId
    
### （2）	前端需求：

    数据返回格式如下
    
![](/src/main/resources/img/ui-6.png)

## 2、保存接口

### （1）	前端发送数据：

    同查询接口的返回数据
    
### （2）	前端需求：

    正常response返回
    
![](/src/main/resources/img/drug-1.png)

![](/src/main/resources/img/drug-2.png)

 


====================================先不动=====================================
# 六、随访记录表

主要诊断对应 该次病例的主要诊断


# 七、入院评估 



# 八、随访报告表

## 查询接口：

（1）一个随访报告的接口，查询 随访报告表 及 病史（自出院后）

（2）查体表

（3）心电图检查

（4）化验检查

（5）药物方案

（6）个体化危险因素控制情况

（7）药物不良反应

## 保存接口：

（1）随访报告表 及 

（2）病史（自出院后）

（3）查体表

（4）心电图检查

（5）化验检查

（6）药物方案

（7）个体化危险因素控制情况

（8）药物不良反应

 
 

 

 


 

 


 


 



