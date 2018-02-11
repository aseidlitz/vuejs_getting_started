package com.etcoleman.sample.jsonServer;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

import static org.eclipse.jetty.servlet.ServletContextHandler.NO_SESSIONS;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) throws Exception {

    System.out.println("Hello World!");

    Server server = null;

    try {

      server = new Server(8080);

      ServletContextHandler servletContextHandler = new ServletContextHandler(NO_SESSIONS);

      servletContextHandler.setContextPath("/");

      server.setHandler(servletContextHandler);

      ServletHolder servletHolder = servletContextHandler.addServlet(ServletContainer.class, "/rest/v1/*");
      servletHolder.setInitOrder(0);
      servletHolder.setInitParameter(
          "jersey.config.server.provider.packages",
          "com.etcoleman.sample.jsonServer.resources"
      );

      server.start();

      // server.dumpStdErr();

      server.join();

    } catch(Exception ex){
      ex.printStackTrace();
    }finally {
      server.stop();
      server.destroy();
    }
  }
}
