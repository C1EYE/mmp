package com.craftinginterpreters.mmp;

/**
 * @author c1eye
 * time 2021/10/15 21:39
 */
public enum TokenType {
    // 单字符token类型
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

    // 一或者二字符类型
    BANG, BANG_EQUAL,
    EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,

    // 字面值
    IDENTIFIER, STRING, NUMBER,

    // 保留字.
    AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NIL, OR,
    PRINT, RETURN, SUPER, THIS, TRUE, VAR, WHILE,

    EOF
}
