public class ServiceStation {

    public void check(Transport transport) {

        System.out.println("Обслуживаем " + transport.getModelName() + ". Надо заменить "
                + transport.getWheelsCount() + " покрышки.");

        for (int i = 0; i < transport.getWheelsCount(); i++) transport.updateTyre();

        transport.service();

    }
}
