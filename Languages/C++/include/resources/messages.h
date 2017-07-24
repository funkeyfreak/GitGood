//
// Created by Administrator on 4/24/2017.
//

#ifndef GITGOOD_MESSAGES_H
#define GITGOOD_MESSAGES_H
#include <map>
#include <list>

#include "../../../../Resources/Headers/global.h"
/**
 *
 */
class messages{
    static int instances = 0;
protected:
    template <typename T>
    /**
     *
     * @tparam T
     */
    std::map<string, T> container;
public:
    template <typename toGet, typename toReturn>
    /**
     *
     * @tparam toGet
     * @tparam toReturn
     * @return
     */
    virtual toReturn set(static const toGet);
    template <typename T>
    /**
     *
     * @tparam T
     */
    virtual void print(static const T)=0;
    template <typename toGet, typename toReturn>
    /**
     *
     * @tparam toGet
     * @tparam toReturn
     * @return
     */
    virtual toReturn get(static const toGet)=0;
    template <typename T>
    /**
     *
     * @tparam T
     */
    virtual void messages(static const T){
        instances++;
    };
    /**
     * Destructor, removes
     */
    ~messages(){
        delete this->container;
    }

};


#endif //GITGOOD_MESSAGES_H
