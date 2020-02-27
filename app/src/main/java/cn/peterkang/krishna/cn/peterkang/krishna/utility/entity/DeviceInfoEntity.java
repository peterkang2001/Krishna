package cn.peterkang.krishna.cn.peterkang.krishna.utility.entity;

public class DeviceInfoEntity {
    // 屏幕宽度
    private Integer width;

    // 屏幕高度
    private Integer height;

    // 屏幕密度
    private Float density;

    // 屏幕密度Dpi
    private Integer desnsityDpi;

    // 屏幕宽度DP
    private Integer screenWidth;

    // 屏幕高度DP
    private Integer screenHeight;


    @Override
    public String toString() {
        return "DeviceInfoEntity{" +
                "width=" + width +
                ", height=" + height +
                ", density=" + density +
                ", desnsityDpi=" + desnsityDpi +
                ", screenWidth=" + screenWidth +
                ", screenHeight=" + screenHeight +
                '}';
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Float getDensity() {
        return density;
    }

    public void setDensity(Float density) {
        this.density = density;
    }

    public Integer getDesnsityDpi() {
        return desnsityDpi;
    }

    public void setDesnsityDpi(Integer desnsityDpi) {
        this.desnsityDpi = desnsityDpi;
    }

    public Integer getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(Integer screenWidth) {
        this.screenWidth = screenWidth;
    }

    public Integer getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(Integer screenHeight) {
        this.screenHeight = screenHeight;
    }
}
