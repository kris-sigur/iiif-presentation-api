package de.digitalcollections.iiif.presentation.model.api;

import java.util.List;

/**
 * <p>
 * Recommended URI Pattern: {scheme}://{host}/{prefix}/{identifier}/range/{name}</p>
 */
public interface Range extends IiifResource {

  List<String> getCanvases();

  void setCanvases(List<String> canvases);

  String getDescription();

  void setDescription(String description);

  String getLabel();

  void setLabel(String label);

  List<Metadata> getMetadata();

  void setMetadata(List<Metadata> metadata);

  List<Range> getRanges();

  void setRanges(List<Range> ranges);

  String getStartCanvas();

  /**
   * @param startCanvas A link from a sequence or range to a canvas that is contained within the sequence. On seeing
   * this relationship, a client should advance to the specified canvas when beginning navigation through the
   * sequence/range. This allows the client to begin with the first canvas that contains interesting content rather than
   * requiring the user to skip past blank or empty canvases manually. A sequence or a range may have this relationship,
   * and the target must be a canvas.
   */
  void setStartCanvas(String startCanvas);

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
