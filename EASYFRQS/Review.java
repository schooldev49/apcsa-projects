public class ReviewCollecter {
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;
    
    public ReviewCollector()
    {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }
    // Adds a new review
    public void addReview(ProductReview prodReview)
    {
        reviewList.add(prodReview);
        String name = prodReview.getName();
        productList.add(name);
    }
    // Number of good reviews
    public int getNumGoodReviews(String prodName)
    {
        int goodReviews = 0;
        for (ProductReview rvw: reviewList)
        {
            if (rvw.getName() == prodName)
            {
                String rvwStr = rvw.getReview();
                
                if (rvwStr.contains("best"))
                {
                    goodReviews++;
                }
            }
        }
        return goodReviews;
    }
}
