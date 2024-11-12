package com.EGbooks.EG_Book.Model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.ref.PhantomReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OxucuResponse {
    private Integer id;
    private String firstName;
    private String lastName;

    public String getFullName() {
        return firstName + " " + lastName;
    }

}
