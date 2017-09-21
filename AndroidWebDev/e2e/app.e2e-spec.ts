import { AndroidWebDevPage } from './app.po';

describe('android-web-dev App', () => {
  let page: AndroidWebDevPage;

  beforeEach(() => {
    page = new AndroidWebDevPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
