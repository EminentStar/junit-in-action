package com.eminentstar.junitinaction.ch03.mastering;

public interface RequestHandler {
  Response process(Request request) throws Exception;
}
