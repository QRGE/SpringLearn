package qr.program.spring.bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @Author qr
 * @Date 2022/5/11-20:45
 */
@Component
@AllArgsConstructor
@NoArgsConstructor
@ToString
@SuppressWarnings("all")
public class Operator {

    private Integer id = 1;

    private String name = "你好哇";
}
