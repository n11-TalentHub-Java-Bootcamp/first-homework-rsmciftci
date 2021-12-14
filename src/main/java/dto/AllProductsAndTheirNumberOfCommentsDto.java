package dto;

import java.math.BigDecimal;

public class AllProductsAndTheirNumberOfCommentsDto {

    private Long productId;

    private String productName;

    private BigDecimal productPrice;

    private Long numberOfComments;

    public AllProductsAndTheirNumberOfCommentsDto() {
    }

    public AllProductsAndTheirNumberOfCommentsDto(Long productId, String productName, BigDecimal productPrice, Long numberOfComments) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.numberOfComments = numberOfComments;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Long getNumberOfComments() {
        return numberOfComments;
    }

    public void setNumberOfComments(Long numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    @Override
    public String toString() {
        return "findAllProductsAndItsNumberOfCommentsDto{" +
                "product_id=" + productId +
                ", product_name='" + productName + '\'' +
                ", product_price=" + productPrice +
                ", number_of_comments='" + numberOfComments + '\'' +
                '}';
    }
}
