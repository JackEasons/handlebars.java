package com.github.edgarespina.handlerbars.internal;

import java.io.IOException;
import java.io.Writer;

import com.github.edgarespina.handlerbars.Template;

class Partial extends BaseTemplate {

  private Template template;

  public Partial() {
  }

  public Partial template(final Template template) {
    this.template = template;
    return this;
  }

  @Override
  public void doApply(final Context scope, final Writer writer)
      throws IOException {
    template.apply(scope, writer);
  }

  @Override
  public String rawText() {
    return template.toString();
  }

  @Override
  public boolean remove(final Template child) {
    return ((BaseTemplate) template).remove(child);
  }
}
