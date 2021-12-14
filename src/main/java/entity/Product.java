package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="PRODUCT")

public class Product {

    @SequenceGenerator(name = "generator", sequenceName ="PRODUCT_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(precision  = 19, scale = 2)
    private BigDecimal price;

    @Column(name = "REGISTRATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID", foreignKey = @ForeignKey(name ="FK_PRODUCT_CATEGORY_ID"))
    private Category category;


    /*
    CascadeType.ALL is selected. If product is deleted, all comments belong to it, will be deleted too.
    Without product, product comments are meaningless. No need to store them in database.
    */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductComment> productComments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<ProductComment> getProductComments() {
        return productComments;
    }

    public void setProductComments(List<ProductComment> productComments) {
        this.productComments = productComments;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", registrationDate=" + registrationDate +
                ", category=" + category +
                ", productComments=" + productComments +
                '}';
    }
}
