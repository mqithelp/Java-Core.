public class ServiceStation {
    public void check(Replace transport) {
        System.out.println("Обслуживаем " + transport.getTransportName());
        for (int i = 0; i < transport.getTransportWheelsCount(); i++) {
            transport.updateTyre();
        }

    }
}
