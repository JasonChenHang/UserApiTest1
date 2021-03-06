/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.1-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.User;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-10T14:08:04.148Z")

@Api(value = "user", description = "the user API")
public interface UserApi {

    @ApiOperation(value = "creat an user", nickname = "addUser", notes = "", tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "failed to creat user") })
    @RequestMapping(value = "/user",
        method = RequestMethod.POST)
    ResponseEntity<Void> addUser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user);


    @ApiOperation(value = "delete an user by id", nickname = "deleteUserById", notes = "", tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "succeddfullt delete an user"),
        @ApiResponse(code = 404, message = "user of this id not found") })
    @RequestMapping(value = "/user/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUserById(@ApiParam(value = "",required=true) @PathVariable("id") Integer id);


    @ApiOperation(value = "Get single user by id ", nickname = "getUserById", notes = "Retrun a user by id", response = User.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK and a user", response = User.class),
        @ApiResponse(code = 404, message = "user does not exsit") })
    @RequestMapping(value = "/user/{id}",
        method = RequestMethod.GET)
    ResponseEntity<User> getUserById(@ApiParam(value = "",required=true) @PathVariable("id") Integer id);


    @ApiOperation(value = "updated an user", nickname = "userPut", notes = "", tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Invalidate user"),
        @ApiResponse(code = 404, message = "can't found this user") })
    @RequestMapping(value = "/user",
        method = RequestMethod.PUT)
    ResponseEntity<Void> userPut(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user);

}
