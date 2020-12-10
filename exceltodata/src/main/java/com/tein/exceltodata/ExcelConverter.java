package com.tein.exceltodata;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

@Service
public class ExcelConverter {

    private final ExcelRepository excelRepository;

    public ExcelConverter(ExcelRepository excelRepository) {
        this.excelRepository = excelRepository;
    }
    public void ExcelConvert() {
        Calendar today = Calendar.getInstance();
        int month = today.get(Calendar.MONTH) + 1;
        int day = today.get(Calendar.DAY_OF_MONTH);
        int year = today.get(Calendar.YEAR);
        int hour = today.get(Calendar.HOUR_OF_DAY);
        int minute = today.get(Calendar.MINUTE);

        HashSet<String> urlSet = new HashSet<String>();
        Map<Integer, Resource> resourceMap = new HashMap<>();
        File outputFile = new File(day + "-" + month + "-" + year + "T" + hour + "-" + minute + "-" + "Script.sql");

        try {

            File file = ResourceUtils.getFile("classpath:un-id-listesi.xlsx");

            XSSFWorkbook myWorkBook = new XSSFWorkbook(new FileInputStream(file));

            int kayitId=0;
            int page=0;
             int sheetNumber=myWorkBook.getNumberOfSheets();

            for (int i = 0; i < myWorkBook.getNumberOfSheets(); i++) {
                page++;
                XSSFSheet firstSheet = myWorkBook.getSheetAt(i);


                Resource resourceTitle = new Resource();

                for (int k = 1; k <= firstSheet.getLastRowNum(); k++) {
                    Row row = firstSheet.getRow(k);
                    if (row != null) {
                        UnData resourceContent = new UnData();

                            for (int j = 0; j < row.getLastCellNum(); j++) {
                                Cell cell = row.getCell(j);
                                if (cell != null) {

                                    int i1=  cell.getColumnIndex();
                                    if (j == 0) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setUN_ID(cell.getRichStringCellValue().getString());
                                    }
                                    if (j == 1) {
                                        // System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setUN_NO(cell.getStringCellValue());
                                    }
                                    if (j == 2) {
                                        // System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setISIM(cell.getStringCellValue());
                                    }
                                    if (j == 3) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setSINIF(cell.getStringCellValue());
                                    }
                                    if (j == 4) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setPAKETLEME_GRUBU(cell.getStringCellValue());
                                    }
                                    if (j == 5) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setETIKETLER(cell.getStringCellValue());
                                    }
                                    if (j == 6) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setOZEL_HUKUMLER(cell.getStringCellValue());
                                    }
                                    if (j == 7) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setSINIRLI_ISTISNAI_MIKTARLAR_7A(cell.getStringCellValue());
                                    }
                                    if (j == 8) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setSINIRLI_ISTISNAI_MIKTARLAR_7B(cell.getStringCellValue());
                                    }
                                    if (j == 9) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setAMBALAJ_TALIMATLARI(cell.getStringCellValue());
                                    }
                                    if (j == 10) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setOZEL_AMBALAJ_HUKUMLERI(cell.getStringCellValue());
                                    }
                                    if (j == 11) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setKARISIK_AMBALAJ_HUKUMLERI(cell.getStringCellValue());
                                    }
                                    if (j == 12) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setPORTATIF_TALIMATLAR(cell.getStringCellValue());
                                    }if (j == 13) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setPORTATIF_OZEL_HUKUMLER(cell.getStringCellValue());
                                    }if (j == 14) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setADR_TANK_KODU(cell.getStringCellValue());
                                    }if (j == 15) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setADR_OZEL_HUKUMLER(cell.getStringCellValue());
                                    }if (j == 16) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setTANK_TASIMASI(cell.getStringCellValue());
                                    }if (j == 17) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setTASIMA_KATEGORISI(cell.getStringCellValue());
                                    }if (j == 18) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setTASIMA_OZEL_AMBALAJLAR(cell.getStringCellValue());
                                    }if (j == 19) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setTASIMA_OZEL_DOKME(cell.getStringCellValue());
                                    }if (j == 20) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setTASIMA_OZEL_ELLECLEME(cell.getStringCellValue());
                                    }if (j == 21) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setTASIMA_OZEL_OPERASYON(cell.getStringCellValue());
                                    }if (j == 22) {
                                        //System.out.println(j + " " + cell.getStringCellValue());
                                        resourceContent.setTEHLIKE_TANIMLAMA_NO(cell.getStringCellValue());
                                    }
                                    if (j == 23) {
                                        resourceContent.setSINIFLANDIRMA_KODU(cell.getStringCellValue());
                                    }
                                }
                            }
                            excelRepository.save(resourceContent);

                            //resourceMap.put(kayitId, resourceContent); kayitId++;
                    }

                }


            }


            for (Map.Entry<Integer, Resource> pair : resourceMap.entrySet()) {
                System.out.format("key: %s, value: %d%n", pair.getKey(), pair.getValue());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
