package Percobaan;

public class ElectricityBill1841720170Aryo implements Payable1841720170Aryo {

    private int kwh;
    private String category;

    public ElectricityBill1841720170Aryo(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    public int getKwhAryo() {
        return kwh;
    }

    public void setKwhAryo(int kwh) {
        this.kwh = kwh;
    }

    public String getCategoryAryo() {
        return category;
    }

    public void setCategoryAryo(String category) {
        this.category = category;
    }

    @Override
    public int getPaymentAmountAryo() {
        return kwh * getBasePriceAryo();
    }

    public int getBasePriceAryo() {
        int bPrice = 0;
        switch (category) {
            case "R-1":
                bPrice = 100;
                break;
            case "R-2":
                bPrice = 200;
                break;
        }
        return bPrice;
    }

    public String getBillInfoAryo() {
        return "kwh = " + kwh + "\n"
                + "Category = " + category + "(" + getBasePriceAryo() + "per KWH)\n";
    }

}
