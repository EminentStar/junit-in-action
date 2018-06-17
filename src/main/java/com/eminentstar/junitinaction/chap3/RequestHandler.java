package com.eminentstar.junitinaction.chap3;

public interface RequestHandler {
  Response process(Request request) throws Exception;
}
