package com.eminentstar.junitinaction.ch03.mastering;

public interface Controller {
  Response processRequest(Request request);
  void addHandler(Request request, RequestHandler requestHandler);
}
