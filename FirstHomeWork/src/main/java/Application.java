import dto.CommentsOfUserDto;
import dto.ProductCommentsDto;
import dto.AllProductsAndTheirNumberOfCommentsDto;
import entityservice.ProductService;
import entityservice.UserService;

import java.util.List;

public class Application {
    public static void main(String[] args){

        // Second Question Starts Here
        ProductService productService = new ProductService();
        // Input Here
        Long productId = 3L;
        List<ProductCommentsDto> productList = productService.findAllCommentsOfProduct(productId);
        System.out.println("\n\n\n2. Question\n");
        for(ProductCommentsDto productCommentsDto : productList){
            System.out.println(productCommentsDto);
        }



        // Third Question Starts Here
        System.out.println("\n\n\n3. Question\n");
        List<AllProductsAndTheirNumberOfCommentsDto> allProductsAndTheirNumberOfCommentsList =
                productService.findAllProductsAndTheirNumberOfComments();

        for(AllProductsAndTheirNumberOfCommentsDto productCommentAndItsNumberOfComment: allProductsAndTheirNumberOfCommentsList){
            System.out.println(productCommentAndItsNumberOfComment);
        }


        // Fourth Question Starts Here
        System.out.println("\n\n\n4. Question\n");
        UserService userService = new UserService();
        // Input Here
        Long userId = 3L;
        List<CommentsOfUserDto> commentsOfUserList = userService.findAllCommentsOfUser(userId);
        for(CommentsOfUserDto comment : commentsOfUserList){
            System.out.println(comment);
        }


    }
}




