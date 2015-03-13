/**
 * Represent a search result.
 */
public class SearchResult {

    /**
     * The path regarding the result file.
     */
    private String path;

    /**
     * Text provided by Apache Lucene
     * explaining why this result is a match.
     */
    private String explanation;

    /**
     * Constructor.
     * @param path path regarding the result file
     * @param explanation explanation providade by Lucene
     */
    public SearchResult(String path, String explanation) {
        this.setPath(path);
        this.setExplanation(explanation);
    }

    /**
     * Default constructor.
     */
    public SearchResult(){

    }

    /**
     * Set the content of explanation.
     * @param explanation new explanation
     */
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    /**
     * Get the content of explanation.
     * @return explanation
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * Set the path of the search result.
     * @param path new path.
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Get the current path of the search result.
     * @return current path
     */
    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return path;
    }

}
