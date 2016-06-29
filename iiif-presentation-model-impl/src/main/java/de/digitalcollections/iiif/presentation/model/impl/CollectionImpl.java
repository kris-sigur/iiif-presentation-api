package de.digitalcollections.iiif.presentation.model.impl;

import de.digitalcollections.iiif.presentation.model.api.Collection;
import de.digitalcollections.iiif.presentation.model.api.Metadata;
import de.digitalcollections.iiif.presentation.model.api.Thumbnail;
import java.net.URI;
import java.util.List;

public class CollectionImpl extends AbstractIiifResourceImpl implements Collection {

  private String description; // recommended
  private final String label; // required
  private final List<Metadata> metadata; // recommended
  private Thumbnail thumbnail; // recommended
  private String viewingHint; // optional

  public CollectionImpl(URI id, String label, List<Metadata> metadata) {
    assert id != null;
    assert label != null;

    this.id = id;
    this.label = label;

    this.metadata = metadata;

    type = "sc:Collection";
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String getLabel() {
    return label;
  }

  @Override
  public List<Metadata> getMetadata() {
    return metadata;
  }

  @Override
  public Thumbnail getThumbnail() {
    return thumbnail;
  }

  @Override
  public void setThumbnail(Thumbnail thumbnail) {
    this.thumbnail = thumbnail;
  }

  @Override
  public String getViewingHint() {
    return viewingHint;
  }

  @Override
  public void setViewingHint(String viewingHint) {
    this.viewingHint = viewingHint;
  }
}
