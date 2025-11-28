package bankabstract.service;

import bankabstract.entity.User;

public abstract class AbstractPaymentService {


    public abstract void showBalance(User y);

    public abstract void topUpBalance(User y);
    public abstract void substractBalance(User y);

}
