package de.digitalcollections.iiif.presentation.model.api.v2_0_0;

import java.util.List;

public interface PropertyValue {
  List<String> getValues();

  default String getFirstValue() {
    return getValues().get(0);
  }
}
