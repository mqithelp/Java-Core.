public class ServiceStation {

    public void check(Transport transport) {

        System.out.println("Обслуживаем " + transport.getModelName() + ". Надо заменить "
                + transport.getWheelsCount() + " покрышки.");

            for (int i = 0; i < transport.getWheelsCount(); i++) transport.updateTyre();

        if (transport instanceof CheckEngine) {
            ((CheckEngine) transport).checkEngine();
        }
        if (transport instanceof CheckTrailer) {
            ((CheckTrailer) transport).checkTrailer();
        }
    }
}
