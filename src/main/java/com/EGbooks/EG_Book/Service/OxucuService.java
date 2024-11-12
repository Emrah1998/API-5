package com.EGbooks.EG_Book.Service;

import com.EGbooks.EG_Book.Model.response.OxucuResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OxucuService {
    private final Map<Integer, String> oxucuMap = new HashMap<>();

    public OxucuService() {
        oxucuMap.put(1, new OxucuResponse(1, "Emrah", "Garashov").getFullName());
        oxucuMap.put(2, new OxucuResponse(2, "Ilkin", "Eliyev").getFullName());
        oxucuMap.put(3, new OxucuResponse(3, "Turqut", "Quliyev").getFullName());
        oxucuMap.put(4, new OxucuResponse(4, "Ferid", "Hacibabazade").getFullName());
        oxucuMap.put(5, new OxucuResponse(5, "Vaqif", "Bennali").getFullName());
    }

    public String getOxucuById(Integer id) {
        return oxucuMap.get(id);
    }
}
