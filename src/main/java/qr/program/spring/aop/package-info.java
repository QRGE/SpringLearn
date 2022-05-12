/**
 * 面向切面编程：可以将公共部分的代码进行提取通过面向切面技术插入到业务代码中的各个流程部分执行
 * SpringAop 的使用方式：
 * - 引入 aop 包
 * - 创建一个 aspect 加上 @Aspect 和 @Component 注解
 * - 根据需求定义 @Before @After *@Around 方法
 * - 结合需求可以定义 pointCut 或者自定义注解实现切入
 * @Author qr
 * @Date 2022/5/12-17:11
 */
package qr.program.spring.aop;
