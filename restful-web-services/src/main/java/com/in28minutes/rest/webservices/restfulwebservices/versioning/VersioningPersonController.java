package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
  @GetMapping("/v1/person")
  public PersonV1 getFirstVersionOfPerson() {
    return new PersonV1("John Smith");
  }

  @GetMapping("/v2/person")
  public PersonV2 getSecondVersionOfPerson() {
    return new PersonV2(new Name("John", "Doe"));
  }

  @GetMapping(path = "/person", params = "version=1")
  public PersonV1 getFirstVersionPerson() {
    return new PersonV1("John Wick");
  }

  @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
  public PersonV1 getFirstVersionPersonHeader() {
    return new PersonV1("John Snow");
  }

  @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
  public PersonV1 getFirstVersionPersonAccept() {
    return new PersonV1("John Connor");
  }
}
