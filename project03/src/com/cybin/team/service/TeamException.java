package com.cybin.team.service;

/**
 * @description 自定义异常类
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-04-20 10:08
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -338759948L;
   public   TeamException(){
       super();
   }
   public TeamException (String msg){
       super(msg);
   }
}
