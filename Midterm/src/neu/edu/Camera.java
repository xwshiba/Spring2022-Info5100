package neu.edu;

public class Camera {
    private Camera(){}
    private String cameraName;

    private static Camera _instance;
    private Object obj = new Object();

    public Camera getCameraInstance(){
        if (_instance == null) {
            synchronized (obj) {
                if (_instance == null) {
                    _instance = new Camera();
                }
            }
        }
        return _instance;
    }

    public String getCameraName(){
        return cameraName;
    }

    public void setCameraName(String nm){
        cameraName = nm;
    }


}
