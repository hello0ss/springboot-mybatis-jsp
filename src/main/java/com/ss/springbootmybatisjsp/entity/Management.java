package com.ss.springbootmybatisjsp.entity;

import lombok.*;
import lombok.experimental.Accessors;

@Data //包括
/*@Setter               set方法
 *@Getter               get方法
 *@ToString             toString方法
 *@EqualsAndHashCode    HashCode  equals
 * */
@Accessors(chain = true)//链式调用
@NoArgsConstructor //无参构造
@AllArgsConstructor //全参构造
public class Management {
    private String id;
    private String username;
    private String realname;
    private String password;
    private String sex;
    private String salt;

}
