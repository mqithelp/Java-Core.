public class ServiceStation {

    public void check(Transport transport) {

        System.out.println("Обслуживаем " + transport.getModelName());
        if (transport instanceof Replace)
            for (int i = 0; i < transport.getWheelsCount(); i++) ((Replace) transport).updateTyre();

        if (transport instanceof CheckEngine) {
            ((CheckEngine) transport).checkEngine();
        }
        if (transport instanceof CheckTrailer) {
            ((CheckTrailer) transport).checkTrailer();
        }
    }
}
