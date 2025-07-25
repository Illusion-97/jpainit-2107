package ad.ya.jpainit.residences.house.residence;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link Residence}
 */
@Value
public class ResidenceDto implements Serializable {
    HouseDto house;
    PersonneDto resident;
    boolean main;

    /**
     * DTO for {@link ad.ya.jpainit.residences.house.House}
     */
    @Value
    public static class HouseDto implements Serializable {
        AddressDto address;

        /**
         * DTO for {@link ad.ya.jpainit.residences.house.Address}
         */
        @Value
        public static class AddressDto implements Serializable {
            int cp;
            String line1;
            String line2;
        }
    }

    /**
     * DTO for {@link ad.ya.jpainit.residences.person.personne.Personne}
     */
    @Value
    public static class PersonneDto implements Serializable {
        long id;
        IdentityDto identity;

        /**
         * DTO for {@link ad.ya.jpainit.residences.person.Identity}
         */
        @Value
        public static class IdentityDto implements Serializable {
            String firstName;
            String lastName;
            LocalDateTime birthDate;
        }
    }
}