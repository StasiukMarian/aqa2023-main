package testPackage.lesson10restassuredpojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserResponse extends UpdateUserRequest{
    private String updatedAt;
}
