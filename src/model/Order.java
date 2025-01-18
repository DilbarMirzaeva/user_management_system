package model;

public class Order extends BaseEntity{
    private Long userId;
    private Long productId;


    public Order(Long Id, Long userId, Long productId){
        super(Id);
        this.userId = userId;
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }


    @Override
    public String toString() {
        return "Order{" +
                "userId=" + userId +
                ", productId=" + productId +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
