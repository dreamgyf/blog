package com.dreamgyf.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY,reason = "username or password error")
public class UsernameOrPasswordErrorException extends RuntimeException {
}
