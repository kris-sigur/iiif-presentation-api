package de.digitalcollections.iiif.presentation.model.api;

import java.util.List;

/**
 * <p>
 * Recommended URI Pattern: {scheme}://{host}/{prefix}/{identifier}/layer/{name}</p>
 */
public interface Layer extends IiifResource {

  String getDescription();

  void setDescription(String description);

  String getLabel();

  List<Metadata> getMetadata();

  void setMetadata(List<Metadata> metadata);

  Thumbnail getThumbnail();

  void setThumbnail(Thumbnail thumbnail);

  String getViewingDirection();

  /**
   * @see ViewingDirections
   * @param viewingDirection The direction that canvases of the resource should be presented when rendered for the user
   * to navigate and/or read. A range or layer may have a viewing direction.
   */
  void setViewingDirection(String viewingDirection);

  String getViewingHint();

  void setViewingHint(String viewingHint);

}
