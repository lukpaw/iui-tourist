package com.example.iui.tourist.information;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InformationService {

    private final Map<String, List<String>> information;

    public InformationService() {
        information = new HashMap<>();
        information.put("Jakie są muzea?", Arrays.asList(
                "Muzeum Zabawek i Zabawy",
                "Muzeum Historii Kielc",
                "Muzeum Hammonda",
                "Muzeum Wsi Kieleckiej",
                "Muzeum Stefana Żeromskiego",
                "Muzeum Diecezjalne"
        ));
        information.put("Jakie są teatry?", Arrays.asList(
                "Teatr Lalki i Aktora \"Kubuś\" im.Stefana Karskiego",
                "Teatr im. Stefana Żeromskiego",
                "Teatr Ecce Homo",
                "Kielecki Teatr Tańca",
                "Teatr PEGAZ",
                "Teatr TeTaTeT"
        ));
        information.put("Jakie są galerie sztuki?", Arrays.asList(
                "Biuro Wystaw Artystycznych w Kielcach",
                "Galeria Wieża Sztuki",
                "Galeria Sztuki Współczesnej Winda",
                "Galeria Współczesnej Sztuki Sakralnej",
                "Galeria Związku Polskich Artystów Plastyków"
        ));
        information.put("Jakie są baseny?", Arrays.asList(
                "Pływalnia Jurajska",
                "Baseny Tropikalne Binkowski",
                "Pływalnia Delfin",
                "Pływalnia FOKA",
                "Pływalnia ORKA. MOSiR Kielce"
        ));
    }

    public List<String> getInformation(String question) {
        return information.getOrDefault(question, Collections.emptyList());
    }

}
