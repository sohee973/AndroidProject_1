package com.example.demo.decoupled;
// Hello라는 글자를 spring이 출력하고 있다.
public interface MessageProvider {
    String getMessage(); // getMessage라는 메서드
}