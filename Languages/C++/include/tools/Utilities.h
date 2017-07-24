//
// Created by dubjr on 3/26/2017.
//

#ifndef GITGOOD_UTILITIES_H
#define GITGOOD_UTILITIES_H

#endif //GITGOOD_UTILITIES_H
namespace helper {
    template <class T, class U>
    struct same_type
    {
        static const bool value = false;
    };
    template <class T>
    struct same_type<T, T>
    {
        static const bool value = true;
    };
    template<class FirstContainer, class SecondContainer>
    inline bool checkSameType(const FirstContainer &, const SecondContainer &);
}