public class Resources {

    private String baseuri;
    private String authEndPoint;
    private String createProductEndPoint;
    private String createOrderEndPoint;
    private String viewOrderEndPoint;

    private String deleteOrderEndPoint;

    public String getBaseuri() {
        return baseuri;
    }

    public void setBaseuri(String baseuri) {
        this.baseuri = baseuri;
    }

    public String getAuthEndPoint() {
        return authEndPoint;
    }

    public void setAuthEndPoint(String authEndPoint) {
        this.authEndPoint = authEndPoint;
    }

    public String getCreateProductEndPoint() {
        return createProductEndPoint;
    }

    public void setCreateProductEndPoint(String createProductEndPoint) {
        this.createProductEndPoint = createProductEndPoint;
    }

    public String getCreateOrderEndPoint() {
        return createOrderEndPoint;
    }

    public void setCreateOrderEndPoint(String createOrderEndPoint) {
        this.createOrderEndPoint = createOrderEndPoint;
    }

    public String getViewOrderEndPoint() {
        return viewOrderEndPoint;
    }

    public void setViewOrderEndPoint(String viewOrderEndPoint) {
        this.viewOrderEndPoint = viewOrderEndPoint;
    }

    public String getDeleteOrderEndPoint() {
        return deleteOrderEndPoint;
    }

    public void setDeleteOrderEndPoint(String deleteOrderEndPoint) {
        this.deleteOrderEndPoint = deleteOrderEndPoint;
    }
}