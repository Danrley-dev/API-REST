package com.example.TesteUnitario.resource.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class StandardError {


	private LocalDateTime timeStamp;
	private Integer status;
	private String error;
	private String path;
}
