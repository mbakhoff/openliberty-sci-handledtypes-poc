package io.openliberty.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("sci")
public class SampleHander {

  @GET
  public String getResult() {
    return String.valueOf(MyServletContainerInitializer.result);
  }
}
