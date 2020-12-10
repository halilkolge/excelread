package com.tein.exceltodata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resource {

    private String UN_ID;
    private String UN_NO;
    private String ISIM;
    private String SINIF;
    private String SINIFLANDIRMA_KODU;
    private String PAKETLEME_GRUBU;
    private String ETIKETLER;
    private String OZEL_HUKUMLER;
    private String SINIRLI_ISTISNAI_MIKTARLAR_7A;
    private String SINIRLI_ISTISNAI_MIKTARLAR_7B;
    private String AMBALAJ_TALIMATLARI;
    private String OZEL_AMBALAJ_HUKUMLERI;
    private String KARISIK_AMBALAJ_HUKUMLERI;
    private String PORTATIF_TALIMATLAR;
    private String PORTATIF_OZEL_HUKUMLER;
    private String ADR_TANK_KODU;
    private String ADR_OZEL_HUKUMLER;
    private String TANK_TASIMASI;
    private String TASIMA_KATEGORISI;
    private String TASIMA_OZEL_AMBALAJLAR;
    private String TASIMA_OZEL_DOKME;
    private String TASIMA_OZEL_ELLECLEME;
    private String TASIMA_OZEL_OPERASYON;
    private String TEHLIKE_TANIMLAMA_NO;

}
