//
// Created by dubjr on 3/26/2017.
//

#include "../Headers/Utilities.h"

namespace helper {
    template<class FirstContainer, class SecondContainer>
    inline bool checkSameType(const FirstContainer &, const SecondContainer &) {

        return same_type<
                typename FirstContainer::value_type,
                typename SecondContainer::value_type
        >::value;
    }
}